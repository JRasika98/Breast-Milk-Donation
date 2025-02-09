// Generated by view binder compiler. Do not edit!
package com.rasika.nurturenectar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rasika.nurturenectar.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTrackingDonationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView imageViewGo;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RecyclerView recyclerViewUserList;

  @NonNull
  public final TextView textView7;

  private ActivityTrackingDonationBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView imageViewGo, @NonNull LinearLayout linearLayout,
      @NonNull RecyclerView recyclerViewUserList, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.imageViewGo = imageViewGo;
    this.linearLayout = linearLayout;
    this.recyclerViewUserList = recyclerViewUserList;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTrackingDonationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTrackingDonationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tracking_donation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTrackingDonationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewGo;
      TextView imageViewGo = ViewBindings.findChildViewById(rootView, id);
      if (imageViewGo == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.recyclerViewUserList;
      RecyclerView recyclerViewUserList = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewUserList == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityTrackingDonationBinding((ConstraintLayout) rootView, imageViewGo,
          linearLayout, recyclerViewUserList, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
