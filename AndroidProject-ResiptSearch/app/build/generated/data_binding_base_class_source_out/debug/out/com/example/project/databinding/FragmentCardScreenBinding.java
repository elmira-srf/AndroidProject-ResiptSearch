// Generated by view binder compiler. Do not edit!
package com.example.azadehs_elmiras_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.azadehs_elmiras_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCardScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ListView etListview;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvTotalMeals;

  private FragmentCardScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull ListView etListview, @NonNull ImageView imageView, @NonNull TextView textView,
      @NonNull TextView tvTotalMeals) {
    this.rootView = rootView;
    this.etListview = etListview;
    this.imageView = imageView;
    this.textView = textView;
    this.tvTotalMeals = tvTotalMeals;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCardScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCardScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_card_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCardScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etListview;
      ListView etListview = ViewBindings.findChildViewById(rootView, id);
      if (etListview == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tvTotalMeals;
      TextView tvTotalMeals = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalMeals == null) {
        break missingId;
      }

      return new FragmentCardScreenBinding((ConstraintLayout) rootView, etListview, imageView,
          textView, tvTotalMeals);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
