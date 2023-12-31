// Generated by view binder compiler. Do not edit!
package com.modul7.listcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.modul7.listcode.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailCodeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button buttonId;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final LinearLayout container1;

  @NonNull
  public final TextView habitat;

  @NonNull
  public final TextView habitatTeks;

  @NonNull
  public final LinearLayout ikon2;

  @NonNull
  public final ImageView image;

  @NonNull
  public final ImageView imgItemPhoto;

  @NonNull
  public final LinearLayout ketiga;

  @NonNull
  public final TextView namaFilum;

  @NonNull
  public final TextView namaFilumTeks;

  @NonNull
  public final TextView namaSpesies;

  @NonNull
  public final TextView namaSpesiesTeks;

  @NonNull
  public final LinearLayout pertama;

  @NonNull
  public final TextView tvItemDescription;

  @NonNull
  public final TextView tvNama;

  @NonNull
  public final TextView tvNamaIlmiah;

  private ActivityDetailCodeBinding(@NonNull ScrollView rootView, @NonNull Button buttonId,
      @NonNull CardView cardView, @NonNull LinearLayout container1, @NonNull TextView habitat,
      @NonNull TextView habitatTeks, @NonNull LinearLayout ikon2, @NonNull ImageView image,
      @NonNull ImageView imgItemPhoto, @NonNull LinearLayout ketiga, @NonNull TextView namaFilum,
      @NonNull TextView namaFilumTeks, @NonNull TextView namaSpesies,
      @NonNull TextView namaSpesiesTeks, @NonNull LinearLayout pertama,
      @NonNull TextView tvItemDescription, @NonNull TextView tvNama,
      @NonNull TextView tvNamaIlmiah) {
    this.rootView = rootView;
    this.buttonId = buttonId;
    this.cardView = cardView;
    this.container1 = container1;
    this.habitat = habitat;
    this.habitatTeks = habitatTeks;
    this.ikon2 = ikon2;
    this.image = image;
    this.imgItemPhoto = imgItemPhoto;
    this.ketiga = ketiga;
    this.namaFilum = namaFilum;
    this.namaFilumTeks = namaFilumTeks;
    this.namaSpesies = namaSpesies;
    this.namaSpesiesTeks = namaSpesiesTeks;
    this.pertama = pertama;
    this.tvItemDescription = tvItemDescription;
    this.tvNama = tvNama;
    this.tvNamaIlmiah = tvNamaIlmiah;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_code, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailCodeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_id;
      Button buttonId = ViewBindings.findChildViewById(rootView, id);
      if (buttonId == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.container1;
      LinearLayout container1 = ViewBindings.findChildViewById(rootView, id);
      if (container1 == null) {
        break missingId;
      }

      id = R.id.habitat;
      TextView habitat = ViewBindings.findChildViewById(rootView, id);
      if (habitat == null) {
        break missingId;
      }

      id = R.id.habitat_teks;
      TextView habitatTeks = ViewBindings.findChildViewById(rootView, id);
      if (habitatTeks == null) {
        break missingId;
      }

      id = R.id.ikon2;
      LinearLayout ikon2 = ViewBindings.findChildViewById(rootView, id);
      if (ikon2 == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.img_item_photo;
      ImageView imgItemPhoto = ViewBindings.findChildViewById(rootView, id);
      if (imgItemPhoto == null) {
        break missingId;
      }

      id = R.id.ketiga;
      LinearLayout ketiga = ViewBindings.findChildViewById(rootView, id);
      if (ketiga == null) {
        break missingId;
      }

      id = R.id.nama_filum;
      TextView namaFilum = ViewBindings.findChildViewById(rootView, id);
      if (namaFilum == null) {
        break missingId;
      }

      id = R.id.nama_filum_teks;
      TextView namaFilumTeks = ViewBindings.findChildViewById(rootView, id);
      if (namaFilumTeks == null) {
        break missingId;
      }

      id = R.id.nama_spesies;
      TextView namaSpesies = ViewBindings.findChildViewById(rootView, id);
      if (namaSpesies == null) {
        break missingId;
      }

      id = R.id.nama_spesies_teks;
      TextView namaSpesiesTeks = ViewBindings.findChildViewById(rootView, id);
      if (namaSpesiesTeks == null) {
        break missingId;
      }

      id = R.id.pertama;
      LinearLayout pertama = ViewBindings.findChildViewById(rootView, id);
      if (pertama == null) {
        break missingId;
      }

      id = R.id.tv_item_description;
      TextView tvItemDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvItemDescription == null) {
        break missingId;
      }

      id = R.id.tv_nama;
      TextView tvNama = ViewBindings.findChildViewById(rootView, id);
      if (tvNama == null) {
        break missingId;
      }

      id = R.id.tv_nama_ilmiah;
      TextView tvNamaIlmiah = ViewBindings.findChildViewById(rootView, id);
      if (tvNamaIlmiah == null) {
        break missingId;
      }

      return new ActivityDetailCodeBinding((ScrollView) rootView, buttonId, cardView, container1,
          habitat, habitatTeks, ikon2, image, imgItemPhoto, ketiga, namaFilum, namaFilumTeks,
          namaSpesies, namaSpesiesTeks, pertama, tvItemDescription, tvNama, tvNamaIlmiah);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
