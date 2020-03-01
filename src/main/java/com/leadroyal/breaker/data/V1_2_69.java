package com.leadroyal.breaker.data;

import com.leadroyal.breaker.BlackInfo;

import java.util.LinkedList;

public class V1_2_69 {
    private static BlackInfo data;

    public static BlackInfo getData() {
        if (data == null) {
            data = new BlackInfo();
            data.version = 1269;
            data.known = new LinkedList<BlackInfo.BlockItem>() {{
            }};
            data.unknown = new LinkedList<BlackInfo.BlockItem>() {{
                add(new BlackInfo.BlockItem(-2439930098895578154L, ""));
                add(new BlackInfo.BlockItem(-582813228520337988L, ""));
                add(new BlackInfo.BlockItem(-26639035867733124L, ""));
                add(new BlackInfo.BlockItem(386461436234701831L, ""));
                add(new BlackInfo.BlockItem(1153291637701043748L, ""));
                add(new BlackInfo.BlockItem(1698504441317515818L, ""));
                add(new BlackInfo.BlockItem(7375862386996623731L, ""));
                add(new BlackInfo.BlockItem(7658177784286215602L, ""));
                add(new BlackInfo.BlockItem(8055461369741094911L, ""));
            }};
        }
        return data;
    }
}