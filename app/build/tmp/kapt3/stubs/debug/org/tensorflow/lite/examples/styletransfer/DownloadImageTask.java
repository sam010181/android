package org.tensorflow.lite.examples.styletransfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lorg/tensorflow/lite/examples/styletransfer/DownloadImageTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "bmImage", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "getBmImage", "()Landroid/widget/ImageView;", "setBmImage", "doInBackground", "params", "", "([Ljava/lang/String;)Landroid/graphics/Bitmap;", "onPostExecute", "", "result", "app_debug"})
final class DownloadImageTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
    @org.jetbrains.annotations.NotNull()
    private android.widget.ImageView bmImage;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.graphics.Bitmap doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.String... params) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getBmImage() {
        return null;
    }
    
    public final void setBmImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    public DownloadImageTask(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView bmImage) {
        super();
    }
}