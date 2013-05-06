package mx.androidtitlan.fragmentoverfragment.fragment;

import mx.androidtitlan.fragmentoverfragment.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondSleeveImageFragment extends Fragment{

	public static SecondSleeveImageFragment newInstance(String title) {
		SecondSleeveImageFragment first = new SecondSleeveImageFragment();
		Bundle bundle = new Bundle();
		bundle.putString("title", title);
		first.setArguments(bundle);
		return first;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View myFragmentView = inflater.inflate(R.layout.second_fragment,
				container, false);

		return myFragmentView;
	}

}
