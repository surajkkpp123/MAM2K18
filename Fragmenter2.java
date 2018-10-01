package com.mnnit.athleticmeet.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragmenter3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmenter3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmenter2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Fragmenter2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmenter3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmenter3 newInstance(String param1, String param2) {
        Fragmenter3 fragment = new Fragmenter3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    String[] values=new String[]{"9:30 a.m.         110m Hurdles (BOYS)",
            "10:00 a.m.        Shotput (BOYS)",
            "11:00 a.m.        Shotput (GIRLS)",
            "11:00 a.m.        4x400m Relay Time Trial (BOYS)",
            "11:20 a.m.        4x400m Relay Time Trial (GIRLS)",
            "11:45 a.m.        Triple Jump (BOYS)",
            "11:45 a.m.        100m Hurdles (GIRLS)",
            "                                   ",
            "LUNCH    1:00-2:00 p.m.",
            "                        ",

            "2:00 p.m.         200m Heats (BOYS)",
            "2:00 p.m.         Javelin (BOYS)",
            "2:15 p.m.         200m Heats (Girls)",
            "2:45 p.m.         Javelin (GIRLS)",
            "3:15 p.m.         High Jump (BOYS)",
            "3:30 p.m.         400m FINALS (BOYS)",
            "4:00 p.m.         High jump (GIRLS)",
            "4:00 p.m.         400m FINALS (GIRLS)",
            "4:30 p.m.         800m FINALS (BOYS)",
            "4:45 p.m.         800m FINALS (GIRLS)",};
    ListView lv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragmenter2, container, false);
        perform(v);

        return v;
        // Inflate the layout for this fragment
   //     return inflater.inflate(R.layout.fragment_fragmenter2, container, false);
    }
    public void perform(View v) {
        lv1 = (ListView)v.findViewById(R.id.list1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,values);
        lv1.setAdapter(adapter);}

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
