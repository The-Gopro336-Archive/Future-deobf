package net.futureclient.client;

import net.minecraft.client.Minecraft;

public abstract class XB
{
    private String[] D;
    public Minecraft k;
    
    public XB(final String[] d) {
        super();
        this.k = Minecraft.getMinecraft();
        this.D = d;
    }
    
    public abstract String M(final String[] p0);
    
    public static String M(String s) {
        final char c = 'd';
        final char c2 = '#';
        final int length = (s = s).length();
        final char[] array = new char[length];
        int n;
        int i = n = length - 1;
        final char[] array2 = array;
        final char c3 = c2;
        final char c4 = c;
        while (i >= 0) {
            final char[] array3 = array2;
            final String s2 = s;
            final int n2 = n;
            final char char1 = s2.charAt(n2);
            --n;
            array3[n2] = (char)(char1 ^ c4);
            if (n < 0) {
                break;
            }
            final char[] array4 = array2;
            final String s3 = s;
            final int n3 = n--;
            array4[n3] = (char)(s3.charAt(n3) ^ c3);
            i = n;
        }
        return new String(array2);
    }
    
    public abstract String M();
    
    public String[] M() {
        return this.D;
    }
}
