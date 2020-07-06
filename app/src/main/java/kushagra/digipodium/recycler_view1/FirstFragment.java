package kushagra.digipodium.recycler_view1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {
    List<String> birds = new ArrayList<>();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        birds.add("Hawk");
        birds.add("Kingfisher");
        birds.add("Duck");
        birds.add("Megapodes");
        birds.add("Loons");
        birds.add("Petrels");
        birds.add("Pelicans");
        birds.add("Shearwater");
        birds.add("Grebes");
        birds.add("Flamingos");
        birds.add("Ospreys");
        birds.add("Darters");
        birds.add("Shags");
        birds.add("Storks");
        birds.add("Eagles");
        birds.add("Jacanas");
        birds.add("Cranes");
        birds.add("Gulls");
        birds.add("Skimmers");
        birds.add("Buttonquail");
        birds.add("Swifts");
        birds.add("Nightjars");
        birds.add("Shrikes");
        birds.add("Vireos");
        birds.add("Rollers");
        birds.add("Turnagra");
        birds.add("Bulbuls");
        birds.add("Warbels");
        birds.add("Waxwings");
        birds.add("Nuthatches");
        birds.add("Wallcreeper");
        birds.add("Trogons");
        birds.add("Larks");
        birds.add("Swallows");
        birds.add("Warble");
        birds.add("Barwings");
        birds.add("Sparrows");
        birds.add("Treecreepers");
        birds.add("Thrushes");
        birds.add("White Eyes");
        birds.add("Blue Birds");
        birds.add("Coldcrests");
        birds.add("Weavers");
        birds.add("Accentors");
        birds.add("pipits");
        birds.add("Finches");
        birds.add("Buntings");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView RVBird = view.findViewById(R.id.RVbird);
        RVBird.setLayoutManager(new LinearLayoutManager(getActivity()));
        BirdAdapter adapter = new BirdAdapter(getActivity(), R.layout.row_birds,birds);
        RVBird.setAdapter(adapter);
    }
        class BirdAdapter extends RecyclerView.Adapter<BirdAdapter.Holder> {

            private final Context context;
            private final int layout ;
            private final List<String> birds;
            private final LayoutInflater inflater;


            public BirdAdapter(Context context,int layout,List<String> birds) {
                this.context = context;
                this.layout = layout;
                this.birds = birds;
                inflater = LayoutInflater.from(context);

            }

            @NonNull
            @Override
            public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = inflater.inflate(layout, parent, false);
                return new Holder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull Holder holder, int position) {
                String birdName = birds.get(position);
                holder.textBirds.setText(birdName);
            }

            @Override
            public int getItemCount() {
                return birds.size();
            }

            class Holder extends RecyclerView.ViewHolder {
                TextView textBirds;

                public Holder(@NonNull View itemView) {
                    super(itemView);
                    textBirds = itemView.findViewById(R.id.textBirds);
                }
            }
        }
    }

