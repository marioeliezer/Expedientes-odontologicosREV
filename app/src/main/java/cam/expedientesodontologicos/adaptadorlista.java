package cam.expedientesodontologicos;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptadorlista extends RecyclerView.Adapter<adaptadorlista.adaptadorlistaViewHolder> implements View.OnClickListener{
    ArrayList<Lista_pacientes>pacientes=new ArrayList<>();
     View.OnClickListener listener;

    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    public ArrayList<Lista_pacientes> getSalidas() {
        return pacientes;
    }

    public adaptadorlista(ArrayList<Lista_pacientes> salidas) {
        this.pacientes = salidas;
    }


    @Override
    public void onBindViewHolder(@NonNull adaptadorlistaViewHolder adaptadorlistaViewHolder, int i) {
        adaptadorlistaViewHolder.imgPaciente.setImageResource(R.drawable.ic_launcher_background);
        adaptadorlistaViewHolder.tvNombre.setText(pacientes.get(i).getNombre());
    }



    @NonNull
    @Override
    public adaptadorlistaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.lista, parent,
               false);
        view.setOnClickListener(this);
        return new adaptadorlistaViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return pacientes.size();
    }

    public adaptadorlista buscar(String s){
        ArrayList<Lista_pacientes> encontrados=new ArrayList<>();

        for (Lista_pacientes p: pacientes) {
            if(p.getNombre().toLowerCase().contains(s)){
                encontrados.add(p);
            }
        }
        adaptadorlista resultado=new adaptadorlista(encontrados);
        return resultado;
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public class adaptadorlistaViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPaciente;
        TextView tvNombre;

        public adaptadorlistaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPaciente=(ImageView)itemView.findViewById(R.id.imlista);
            tvNombre=(TextView) itemView.findViewById(R.id.nombre_lista);

        }
    }
}
