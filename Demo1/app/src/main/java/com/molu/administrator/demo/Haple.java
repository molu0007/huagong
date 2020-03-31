package com.molu.administrator.demo;

public class Haple {
    public static boolean funtion(float l,float tsr,float nir){
        boolean isTsrResult=false;
        //
        boolean isNirResult=false;
        if (l<=40){//低明度
            if (tsr>=0.25f){//tsr通过
                isTsrResult=true;
            }else {//tsr不通过
                isTsrResult=false;
            }
            if (nir>=0.40f){//nir通过
                isNirResult=true;
            }else {//nir不通过
                isNirResult=false;
            }
        }else if (l>40&&l<80){            //中明度
            if (tsr>=0.40f){//tsr通过
                isTsrResult=true;
            }else {//tsr不通过
                isTsrResult=false;
            }
            if (nir>=l/100.0f){//nir通过
                isNirResult=true;
            }else {//nir不通过
                isNirResult=false;
            }
        }else if(l>=80){//高明度
            if (tsr>=0.65f){//tsr通过
                isTsrResult=true;
            }else {//tsr不通过
                isTsrResult=false;
            }
            if (nir>=0.8f){//nir通过
                isNirResult=true;
            }else {//nir不通过
                isNirResult=false;
            }
        }
       return isNirResult&&isTsrResult;
    }

    public static boolean funtion1(float l,float tsr,float nir) {
        boolean isTsrResult=false;
        boolean isNirResult=false;
        if (l<=40){//低明度
            if (tsr>=0.25f){//tsr通过
                isTsrResult=true;
            }else {//tsr不通过
                isTsrResult=false;
            }
            if (nir>=0.40f){//nir通过
                isNirResult=true;
            }else {//nir不通过
                isNirResult=false;
            }
        }else if (l>40&&l<=80){            //中明度
            if (tsr>=(l/100.0f-0.15f)){//tsr通过
                isTsrResult=true;
            }else {//tsr不通过
                isTsrResult=false;
            }
            if (nir>=l/100.0f){//nir通过
                isNirResult=true;
            }else {//nir不通过
                isNirResult=false;
            }
        }else if (l>80&&l<=95){//高明度
            if (tsr>=(l/100.0f-0.15f)){//tsr通过
                isTsrResult=true;
            }else {//tsr不通过
                isTsrResult=false;
            }
            if (nir>=0.8f){//nir通过
                isNirResult=true;
            }else {//nir不通过
                isNirResult=false;
            }
        }else if (l>95){
            if (tsr>=0.85f){//tsr通过
                isTsrResult=true;
            }else {//tsr不通过
                isTsrResult=false;
            }
            if (nir>=0.8f){//nir通过
                isNirResult=true;
            }else {//nir不通过
                isNirResult=false;
            }
        }
        return isNirResult&&isTsrResult;
    }

    public static float  funtion3(Float voc, Float p, Float w) {
        return (voc/(1-p*w))*p*1000;
    }
}
