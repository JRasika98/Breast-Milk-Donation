// Generated by view binder compiler. Do not edit!
package com.rasika.nurturenectar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rasika.nurturenectar.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWelcomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonProcess;

  @NonNull
  public final ImageButton imageButtonLanguage;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final RadioGroup radiGroupGender;

  @NonNull
  public final RadioGroup radiGroupuser;

  @NonNull
  public final RadioButton radioButtonBoy;

  @NonNull
  public final RadioButton radioButtonConsumer;

  @NonNull
  public final RadioButton radioButtonDonater;

  @NonNull
  public final RadioButton radioButtonGirl;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textviewHeading;

  private ActivityWelcomeBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonProcess,
      @NonNull ImageButton imageButtonLanguage, @NonNull ImageView imageView2,
      @NonNull RadioGroup radiGroupGender, @NonNull RadioGroup radiGroupuser,
      @NonNull RadioButton radioButtonBoy, @NonNull RadioButton radioButtonConsumer,
      @NonNull RadioButton radioButtonDonater, @NonNull RadioButton radioButtonGirl,
      @NonNull TextView textView2, @NonNull TextView textviewHeading) {
    this.rootView = rootView;
    this.buttonProcess = buttonProcess;
    this.imageButtonLanguage = imageButtonLanguage;
    this.imageView2 = imageView2;
    this.radiGroupGender = radiGroupGender;
    this.radiGroupuser = radiGroupuser;
    this.radioButtonBoy = radioButtonBoy;
    this.radioButtonConsumer = radioButtonConsumer;
    this.radioButtonDonater = radioButtonDonater;
    this.radioButtonGirl = radioButtonGirl;
    this.textView2 = textView2;
    this.textviewHeading = textviewHeading;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_welcome, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWelcomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonProcess;
      Button buttonProcess = ViewBindings.findChildViewById(rootView, id);
      if (buttonProcess == null) {
        break missingId;
      }

      id = R.id.imageButtonLanguage;
      ImageButton imageButtonLanguage = ViewBindings.findChildViewById(rootView, id);
      if (imageButtonLanguage == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.radiGroupGender;
      RadioGroup radiGroupGender = ViewBindings.findChildViewById(rootView, id);
      if (radiGroupGender == null) {
        break missingId;
      }

      id = R.id.radiGroupuser;
      RadioGroup radiGroupuser = ViewBindings.findChildViewById(rootView, id);
      if (radiGroupuser == null) {
        break missingId;
      }

      id = R.id.radioButtonBoy;
      RadioButton radioButtonBoy = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonBoy == null) {
        break missingId;
      }

      id = R.id.radioButtonConsumer;
      RadioButton radioButtonConsumer = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonConsumer == null) {
        break missingId;
      }

      id = R.id.radioButtonDonater;
      RadioButton radioButtonDonater = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonDonater == null) {
        break missingId;
      }

      id = R.id.radioButtonGirl;
      RadioButton radioButtonGirl = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonGirl == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textviewHeading;
      TextView textviewHeading = ViewBindings.findChildViewById(rootView, id);
      if (textviewHeading == null) {
        break missingId;
      }

      return new ActivityWelcomeBinding((ConstraintLayout) rootView, buttonProcess,
          imageButtonLanguage, imageView2, radiGroupGender, radiGroupuser, radioButtonBoy,
          radioButtonConsumer, radioButtonDonater, radioButtonGirl, textView2, textviewHeading);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
