package com.example.estudiante.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.view.View;

/**
 * Created by estudiante on 25/08/16.
 */
public class numero extends View{
    int contSegundos = 30;
    public boolean hiloestado = true;
    private int contPuntos = 0;
    private Bitmap img1, img2, img3;
    //private Paint paint = new Paint();
    //private GameThread gameThread;
    private Activity a;
    private int playerSize = 40;
    private int x=0,y=0;
    private int xSpeed, ySpeed;
    private int xMax, yMax;
    private int speed=1;

//    private TareaAsincrona gameThread;

    public numero(Context context) {
        super(context);
        try {
            a = (Activity) context;
        img1=BitmapFactory.decodeResource(getResources(), R.mipmap.n1);
        img2=BitmapFactory.decodeResource(getResources(), R.mipmap.n2);
        img3=BitmapFactory.decodeResource(getResources(), R.mipmap.n3);
        } catch (Exception e) {

        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        if(x+playerSize >= xMax)
            xSpeed = -speed;
        if(x <= 0)
            xSpeed = speed;
        if(y+playerSize >= yMax)
            ySpeed = -speed;
        if(y <= 0)
            ySpeed = speed;

        x = x + xSpeed;
        y = y + ySpeed;
        canvas.drawBitmap(img1, x+playerSize, y+playerSize,null);
        canvas.drawBitmap(img2, x+playerSize, y+playerSize,null);
        canvas.drawBitmap(img3, x+playerSize, y+playerSize,null);

    }

class TareaAsincrona extends AsyncTask<Void, Integer, Integer> {

    @Override
    protected Integer doInBackground(Void... params) {
        try {
            if(img1.getHeight()= yMax ){
                contPuntos=contPuntos-1;
            } else  if(img2.getHeight()= yMax ){
                contPuntos=contPuntos-1;
            }
        } catch (Exception e) { }
        return contPuntos;
        }

    }

    @Override
    protected void onPostExecute(Boolean result) {
        if(result){}

    }

    @Override
    protected void onCancelled() {
        hiloestado=false;
    }

    public void execute() {
    }
}
}
