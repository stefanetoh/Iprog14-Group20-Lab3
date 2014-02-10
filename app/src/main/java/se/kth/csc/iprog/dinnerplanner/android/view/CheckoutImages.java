package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.net.Uri;
import android.app.Dialog;

import java.util.Set;
import java.util.HashSet;

public class CheckoutImages {

    DinnerModel dynamicImage = new DinnerModel();
    View view;
    String imageString;
    String dishName;

    public CheckoutImages(View view) {

        // store in the class the reference to the Android View
        this.view = view;

        Set<Dish> result2 = new HashSet<Dish>();
        result2 = dynamicImage.getFullMenu();

        for (Dish d : result2) {
            imageString = d.getImage();
            dishName = d.getName();

        }

        if (imageString.indexOf(".") > 0){
            imageString = imageString.substring(0, imageString.lastIndexOf("."));
        }
        TextView test = (TextView) view.findViewById(R.id.instructions);
        test.setText("Instructrions");

        TextView dname = (TextView) view.findViewById(R.id.dishName);
        dname.setText(dishName);



        /** THIS IS HOW WE DO WHEN WE DO THE IMAGE DONE!**/
        ImageView image = (ImageView) view.findViewById(R.id.smallImg);
        int resID = view.getResources().getIdentifier(imageString , "drawable", ((Activity)view.getContext()).getPackageName());
        image.setImageResource(resID);

        // Setup the rest of the view layout
    }

}
