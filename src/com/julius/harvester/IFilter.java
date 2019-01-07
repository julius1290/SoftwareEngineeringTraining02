package com.julius.harvester;

import com.julius.field.IWheat;

public interface IFilter {
    void splitWheat(IWheat wheat, int numberOfGrains);
}
