package com.chaosbuffalo.bonetown.core.animation;


import org.joml.Matrix4d;


public class AnimationFrame extends Pose {

    public static final int MAX_JOINTS = 100;

    private final Matrix4d[] localJointMatrices;

    public AnimationFrame() {
        super();
        localJointMatrices = new Matrix4d[MAX_JOINTS];
        for (int i = 0; i < MAX_JOINTS; i++){
            localJointMatrices[i] = new Matrix4d();
        }
    }

    public void setLocalJointMatrix(int index, Matrix4d mat){
        localJointMatrices[index].set(mat);
    }

    public Matrix4d getLocalJointMatrix(int index){
        return localJointMatrices[index];
    }


}