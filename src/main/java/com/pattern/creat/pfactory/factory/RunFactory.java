package com.pattern.creat.pfactory.factory;

import com.pattern.creat.pfactory.concrete.BicycleFactory;
import com.pattern.creat.pfactory.concrete.CarFactory;
import com.pattern.creat.pfactory.concrete.TrainFactory;
import com.pattern.creat.pfactory.interfaces.Factory;

/**
 * Created by TimAimee on 2017/4/16.
 */
public class RunFactory {
    public Factory getRunFactory(RunType runType) {
        Factory factory = null;
        switch (runType) {
            case CAR:
                factory = new CarFactory();
                break;
            case BICYCLE:
                factory = new BicycleFactory();
                break;
            case TRAIN:
                factory = new TrainFactory();
                break;
        }
        return factory;
    }
}
