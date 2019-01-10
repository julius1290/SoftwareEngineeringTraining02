package com.julius.harvester;

import com.julius.field.IWheat;

public class Filter implements IFilter{

    int maximumVolume;

    Filter(int maximumVolume){
        this.maximumVolume = maximumVolume;
    }

    @Override
    public void splitWheat(IWheat wheat, int numberOfGrains) {
        System.out.println(wheat.getNumberOfGrains() + " grains have been filtered.");
    }
}
