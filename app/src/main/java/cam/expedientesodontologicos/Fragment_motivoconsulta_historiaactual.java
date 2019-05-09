package cam.expedientesodontologicos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_motivoconsulta_historiaactual extends Fragment {

    View view;
    public Fragment_motivoconsulta_historiaactual() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.motivosconsulta_hitoriaactual_fragment, container, false);
        return view;
    }
}
