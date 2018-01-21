package com.example.android.quakereport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

/**
 * Created by c4q on 1/20/18.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/*
* ArrayAdapter is a special class that fills a ListView with custom objects
*
* https://developer.android.com/reference/android/widget/ArrayAdapter.html
*
* "Returns a view for each object in a collection of data objects you provide, and can be used with
* list-based user interface widgets such as ListView"
*
* "By default, the array adapter creates a view by calling toString() on each data object in the
* collection you provide, and places the result in a TextView. You may also customize what type of
* view is used for the data object in the collection. To customize what type of view is used for the
* data object, override getView(int, View, ViewGroup) and inflate a view resource. For a code
* example, see the CustomChoiceList sample."
*
* We are basing this code on * https://github.com/martyav/ud839_CustomAdapter_Example/blob/master/app/src/main/java/com/example/android/flavor/AndroidFlavorAdapter.java
* */

public class EarthquakeEventAdapter extends ArrayAdapter {
    // this is the name we use for logging error reports.
    // see https://coderwall.com/p/bq7nya/proper-log_tag-on-android

    private static final String LOG_TAG = EarthquakeEvent.class.getSimpleName();

    public EarthquakeEvent(Activity context, ArrayList<EarthquakeEvent> earthquakeEvents) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakeEvents);
    }

    /* now we provide a view for the listview via the getView method
    * @param position The position in the list of data that should be displayed in the listview.
    * @param convertView The recycled view to populate.
    * @param parent The parent ViewGroup that is used for inflation.
    * @return The View for the position in the AdapterView.
    * */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;

        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.id.dummy, parent, false);
        }

        EarthquakeEvent currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the proper ID (place, etc.)

        // Get the place from the current object and
        // set this text on the place TextView

        // Find the TextView in the list_item.xml layout with the ID for the next textview

        // Get the magnitude from the current object and
        // set this text on the magnitude TextView

        // Get the timestamp from the current object and
        // set this text on the timestamp TextView

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;


    }
}
