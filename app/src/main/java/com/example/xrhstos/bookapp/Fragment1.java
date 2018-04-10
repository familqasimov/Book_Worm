package com.example.xrhstos.bookapp;

//import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;



/**
 * Created by philip on 10/4/2018.
 */

public class Fragment1 extends Fragment {

    public Fragment1(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){


        return inflater.inflate(R.layout.fragment_fragment1,parent,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
       // super.onViewCreated(savedInstanceState);
        //setContentView(R.layout.fragment_fragment1);

        GridView gridView = (GridView) view.findViewById(R.id.grid_view);
        ImageAdapter ia = new ImageAdapter(getActivity());
        gridView.setAdapter(ia);


        // Instance of ImageAdapter Class
        //gridView.setAdapter(new ImageAdapter(this));
    }

    public interface ActivityCommunicator{
        public void passDataToActivity(String someValue);
    }
}
