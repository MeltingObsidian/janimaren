package org.meltingobsidian.janimaren.animation;

import org.meltingobsidian.janimaren.object.JObject;

public class Transform extends Animation {
    JObject from, to;
    public Transform(JObject from, JObject to){
        this.from = from;
        this.to = to;
        
    }
}
