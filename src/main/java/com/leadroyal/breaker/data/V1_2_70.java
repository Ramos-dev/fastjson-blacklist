package com.leadroyal.breaker.data;

import com.leadroyal.breaker.BlackInfo;

import java.util.LinkedList;

public class V1_2_70 {
    private static BlackInfo data;

    public static BlackInfo getData() {
        if (data == null) {
            data = new BlackInfo();
            data.version = 1270;
            data.known = new LinkedList<BlackInfo.BlockItem>() {{

            }};
            data.unknown = new LinkedList<BlackInfo.BlockItem>() {{
                add(new BlackInfo.BlockItem(-9164606388214699518L, ""));
                add(new BlackInfo.BlockItem(-7775351613326101303L, ""));
                add(new BlackInfo.BlockItem(-6025144546313590215L, ""));
                add(new BlackInfo.BlockItem(-5939269048541779808L, ""));
                add(new BlackInfo.BlockItem(-5885964883385605994L, ""));
                add(new BlackInfo.BlockItem(-3975378478825053783L, ""));
                add(new BlackInfo.BlockItem(-2378990704010641148L, ""));
                add(new BlackInfo.BlockItem(-905177026366752536L, ""));
                add(new BlackInfo.BlockItem(-831789045734283466L, ""));
                add(new BlackInfo.BlockItem(2660670623866180977L, ""));
                add(new BlackInfo.BlockItem(2731823439467737506L, ""));
                add(new BlackInfo.BlockItem(3637939656440441093L, ""));
                add(new BlackInfo.BlockItem(4254584350247334433L, ""));
                add(new BlackInfo.BlockItem(5274044858141538265L, ""));
                add(new BlackInfo.BlockItem(5474268165959054640L, ""));
                add(new BlackInfo.BlockItem(5596129856135573697L, ""));
                add(new BlackInfo.BlockItem(6854854816081053523L, ""));
                  }};
        }
        return data;
    }
}