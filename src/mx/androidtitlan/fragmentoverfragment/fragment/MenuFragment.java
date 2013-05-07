package mx.androidtitlan.fragmentoverfragment.fragment;

import mx.androidtitlan.fragmentoverfragment.R;
import mx.androidtitlan.fragmentoverfragment.ui.HomeActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuFragment extends ListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list, null);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		String[] colors = getResources().getStringArray(R.array.color_names);
		ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_list_item_1,
				android.R.id.text1, colors);
		setListAdapter(colorAdapter);
	}

	@Override
	public void onListItemClick(ListView lv, View v, int position, long id) {
		Fragment newContent = null;
		switch (position) {
		case 0:
			newContent = new SleeveFragment("Inicio","home");
			break;
		case 1:
			newContent = new SleeveFragment("Futbol", "football");
			break;
		case 2:
			newContent = new SleeveFragment("Futbol Americano","american_football");
			break;
		case 3:
			newContent = new SleeveFragment("F1", "f1");
			break;
		case 4:
			newContent = new SleeveFragment("Lucha Libre", "lucha");
			break;
		case 5:
			newContent = new SleeveFragment("Box", "box");
			break;
		case 6:
			newContent = new SleeveFragment("Beisbol", "baseball");
			break;
		case 7:
			newContent = new SleeveFragment("Basquetbol", "tenis");
			break;
		case 8:
			newContent = new SleeveFragment("Tenis", "tennis");
			break;
		case 9:
			newContent = new SleeveFragment("Videos", "videos");
			break;
		}
		if (newContent != null)
			switchFragment(newContent);
	}

	// the meat of switching the above fragment
	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;

		if (getActivity() instanceof HomeActivity) {
			HomeActivity homeActivity = (HomeActivity) getActivity();
			homeActivity.switchContent(fragment);
		}
	}
}
