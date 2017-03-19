package com.example.android.dictionary_notebook;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Alphabet extends AppCompatActivity {

    MediaPlayer mPlayerA, mPlayerB, mPlayerC, mPlayerD, mPlayerE,
            mPlayerF, mPlayerG, mPlayerH, mPlayerI, mPlayerJ, mPlayerK,
            mPlayerL, mPlayerM, mPlayerN, mPlayerO, mPlayerP, mPlayerQ,
            mPlayerR, mPlayerS, mPlayerT, mPlayerU, mPlayerV, mPlayerW,
            mPlayerX, mPlayerY, mPlayerZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        //creating MediaPlayer objects with different sound for each letter
        mPlayerA = MediaPlayer.create(Alphabet.this, R.raw.a);
        mPlayerB = MediaPlayer.create(Alphabet.this, R.raw.b);
        mPlayerC = MediaPlayer.create(Alphabet.this, R.raw.c);
        mPlayerD = MediaPlayer.create(Alphabet.this, R.raw.d);
        mPlayerE = MediaPlayer.create(Alphabet.this, R.raw.e);
        mPlayerF = MediaPlayer.create(Alphabet.this, R.raw.f);
        mPlayerG = MediaPlayer.create(Alphabet.this, R.raw.g);
        mPlayerH = MediaPlayer.create(Alphabet.this, R.raw.h);
        mPlayerI = MediaPlayer.create(Alphabet.this, R.raw.i);
        mPlayerJ = MediaPlayer.create(Alphabet.this, R.raw.j);
        mPlayerK = MediaPlayer.create(Alphabet.this, R.raw.k);
        mPlayerL = MediaPlayer.create(Alphabet.this, R.raw.l);
        mPlayerM = MediaPlayer.create(Alphabet.this, R.raw.m);
        mPlayerN = MediaPlayer.create(Alphabet.this, R.raw.n);
        mPlayerO = MediaPlayer.create(Alphabet.this, R.raw.o);
        mPlayerP = MediaPlayer.create(Alphabet.this, R.raw.p);
        mPlayerQ = MediaPlayer.create(Alphabet.this, R.raw.q);
        mPlayerR = MediaPlayer.create(Alphabet.this, R.raw.r);
        mPlayerS = MediaPlayer.create(Alphabet.this, R.raw.s);
        mPlayerT = MediaPlayer.create(Alphabet.this, R.raw.t);
        mPlayerU = MediaPlayer.create(Alphabet.this, R.raw.u);
        mPlayerV = MediaPlayer.create(Alphabet.this, R.raw.v);
        mPlayerW = MediaPlayer.create(Alphabet.this, R.raw.w);
        mPlayerX = MediaPlayer.create(Alphabet.this, R.raw.x);
        mPlayerY = MediaPlayer.create(Alphabet.this, R.raw.y);
        mPlayerZ = MediaPlayer.create(Alphabet.this, R.raw.z);

    }

    //playing a different sound depending on which button is clicked
    public void buttonClicked(View v) {

        switch (v.getId()) {

            case R.id.aButton:
                mPlayerA.start();
                break;
            case R.id.bButton:
                mPlayerB.start();
                break;
            case R.id.cButton:
                mPlayerC.start();
                break;
            case R.id.dButton:
                mPlayerD.start();
                break;
            case R.id.eButton:
                mPlayerE.start();
                break;
            case R.id.fButton:
                mPlayerF.start();
                break;
            case R.id.gButton:
                mPlayerG.start();
                break;
            case R.id.hButton:
                mPlayerH.start();
                break;
            case R.id.iButton:
                mPlayerI.start();
                break;
            case R.id.jButton:
                mPlayerJ.start();
                break;
            case R.id.kButton:
                mPlayerK.start();
                break;
            case R.id.lButton:
                mPlayerL.start();
                break;
            case R.id.mButton:
                mPlayerM.start();
                break;
            case R.id.nButton:
                mPlayerN.start();
                break;
            case R.id.oButton:
                mPlayerO.start();
                break;
            case R.id.pButton:
                mPlayerP.start();
                break;
            case R.id.qButton:
                mPlayerQ.start();
                break;
            case R.id.rButton:
                mPlayerR.start();
                break;
            case R.id.sButton:
                mPlayerS.start();
                break;
            case R.id.tButton:
                mPlayerT.start();
                break;
            case R.id.uButton:
                mPlayerU.start();
                break;
            case R.id.vButton:
                mPlayerV.start();
                break;
            case R.id.wButton:
                mPlayerW.start();
                break;
            case R.id.xButton:
                mPlayerX.start();
                break;
            case R.id.yButton:
                mPlayerY.start();
                break;
            default:
                mPlayerZ.start();
                break;
        }
    }
}
