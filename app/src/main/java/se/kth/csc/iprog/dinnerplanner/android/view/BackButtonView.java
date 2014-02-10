package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackButtonView {

    View view;
    public Button backButton;

    public BackButtonView(View view) {

        // store in the class the reference to the Android View
        this.view = view;

        backButton = (Button) view.findViewById(R.id.back_Button);
        backButton.setText("<---");

    }


}
