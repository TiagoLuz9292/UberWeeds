package org.academiadecodigo.sshpecials.gameObjects.Person;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.testing.UberWeeds;

public class StonerFactory {

    public static UberWeeds uberWeeds = new UberWeeds();

    public static GameObject createStoner() {

        GameObject gameObject = new Stoner(StonerInfo.STONER_ONE_LEFT_LIMIT_X, StonerInfo.STONER_ONE_RIGHT_LIMIT_X,
                StonerInfo.STONER_ONE_UP_LIMIT_Y, StonerInfo.STONER_ONE_DOWN_LIMIT_Y,
                StonerInfo.STONER_ONE_X, StonerInfo.STONER_ONE_Y, StonerInfo.STONER_ONE_PICTUREPATH, "Filipe", uberWeeds);

        return gameObject;

    }
}
