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
public class Fragmenter3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Fragmenter3() {
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
    String[] values=new String[]{"9:30 a.m.         10M FINALS (BOYS)",
            "10:00 a.m.        500m FINALS (BOYS)",
            "11:30 a.m.        200m FINALS (BOYS)",
            "11:30 a.m.        Hammer Throw (BOYS)",
            "12:00 a.m.        200m FINALS (GIRLS)",
            "12:30 p.m.        Hammer Throw (GIRLS)",
            "                                   ",
            "LUNCH    1:00-2:00 p.m.",
            "                        ",

            "2:00 p.m.         400m Hurdles (BOYS)",
            "2:30 p.m.         100m FINALS (GIRLS)",
            "2:40 p.m.         4x100m FINALS (BOYS)",
            "2:55 p.m.         4x100m FINALS (GIRLS)",};
    ListView lv2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragmenter3, container, false);
        perform(v);

        return v;
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_fragmenter3, container, false);
    }
    public void perform(View v) {
        lv2 = (ListView)v.findViewById(R.id.list2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,values);
        lv2.setAdapter(adapter);}

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
