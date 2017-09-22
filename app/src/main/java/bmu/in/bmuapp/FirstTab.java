package bmu.in.bmuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FirstTab extends Fragment {

    public FirstTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.student_first, container, false);

        TextView t =(TextView) contentView.findViewById(R.id.cr1);
        t.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), dgtl_img_pro.class);
                startActivity(i);
            }
        });

        TextView t1 =(TextView) contentView.findViewById(R.id.mr2);
        t1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), maheswar.class);
                startActivity(i);
            }
        });

        TextView t2 =(TextView) contentView.findViewById(R.id.mes1);
        t2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), dcafeMess.class);
                startActivity(i);
            }
        });

        TextView t3 =(TextView) contentView.findViewById(R.id.clu1);
        t3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), culinary_club.class);
                startActivity(i);
            }
        });


        TextView t4 =(TextView) contentView.findViewById(R.id.near);
        t4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), NearestFaci.class);
                startActivity(i);
            }
        });


        TextView t5 =(TextView) contentView.findViewById(R.id.complete_tt);
        t5.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), fulltimetable.class);
                startActivity(i);
            }
        });

        TextView t6 =(TextView) contentView.findViewById(R.id.paccl);
        t6.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), pacclub.class);
                startActivity(i);
            }
        });
        return  contentView;
    }


}