// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.styletransfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.tensorflow.lite.examples.styletransfer.R;

public final class ActivityStartpageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout LinearLayout1;

  private ActivityStartpageBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout LinearLayout1) {
    this.rootView = rootView;
    this.LinearLayout1 = LinearLayout1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStartpageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStartpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_startpage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStartpageBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    LinearLayout LinearLayout1 = (LinearLayout) rootView;

    return new ActivityStartpageBinding((LinearLayout) rootView, LinearLayout1);
  }
}
