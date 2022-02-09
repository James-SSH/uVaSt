package com.JamesSSH;

public class Scalar {
    private double d_u, d_V, d_a, d_S, d_t;
    private boolean Hasu, HasV, Hasa, HasS, Hast, AllVal;
    private int LoopError, Error;
    private final String BoardL1 = "----+--------------";
    private final String BoardL2 = "   u| ";
    private final String BoardL3 = "   V| ";
    private final String BoardL4 = "   a| ";
    private final String BoardL5 = "   S| ";
    private final String BoardL6 = "   t| ";


    public Scalar(String u, String V, String a, String S, String t){

        if (!u.equals("?")) {this.d_u = Double.parseDouble(u); this.Hasu = Boolean.TRUE;}
        if (!V.equals("?")) {this.d_V = Double.parseDouble(V); this.HasV = Boolean.TRUE;}
        if (!a.equals("?")) {this.d_a = Double.parseDouble(a); this.Hasa = Boolean.TRUE;}
        if (!S.equals("?")) {this.d_S = Double.parseDouble(S); this.HasS = Boolean.TRUE;}
        if (!t.equals("?")) {this.d_t = Double.parseDouble(t); this.Hast = Boolean.TRUE;}


        do {
            if (u.equals("?") && HasV && Hasa && Hast){
                this.d_u = d_V - (d_a * d_t);
                Error = 0;
                break;
            } else if (u.equals("?") && HasV && Hasa && HasS){
                this.d_u = Math.sqrt(Math.pow(d_V, 2) - (2 * d_a * d_S));
                Error = 0;
                break;
            } else if (u.equals("?") && HasS && Hast && Hasa){
                this.d_u = d_S - (0.5 * d_a * d_t);
                Error = 0;
            } else {
                Error++;
            }
            if (V.equals("?") && Hasu && Hasa && Hast){
                d_V = d_u + (d_a * d_t);
                Error = 0;
                break;
            } else if (V.equals("?") && Hasu && Hasa && HasS){
                d_V = Math.sqrt(Math.pow(d_u, 2) + (2 * d_a * d_S));
                Error = 0;
                break;
            } else {
                Error++;
            }
            if (a.equals("?") && Hasu && HasV && Hast){
                d_a = (d_V - d_u) / d_t;
                Error = 0;
                break;
            } else if (a.equals("?") && HasV && Hasu && HasS){
                d_a = (Math.pow(d_V, 2) - Math.pow(d_u, 2)) / (2*d_S);
                Error = 0;
                break;
            } else if (a.equals("?") && HasS && Hasu && Hast){
                d_a = 2 * (d_S - (d_u * d_t)) / (Math.pow(d_t, 2));
                Error = 0;
                break;
            } else {
                Error++;
            }
            if (S.equals("?") && HasV && Hasu && Hasa){
                d_S = (Math.pow(d_V, 2) - Math.pow(d_u, 2)) / (2*d_a);
                Error = 0;
                break;
            } else if (S.equals("?") && Hasu && Hast && Hasa){
                d_S = (d_u * d_t) + (0.5 * d_a * Math.pow(d_t, 2));
                Error = 0;
                break;
            } else {
                Error++;
            }
            if (t.equals("?") && HasV && Hasu && Hasa){
                d_t = (d_V - d_u) / d_a;
                Error = 0;
                break;
            } else if (t.equals("?") && HasS && Hasu && Hasa){
                d_t = (-d_u + (Math.sqrt(Math.pow(d_t, 2) + (2*d_a*d_S)))) / d_a;
                Error = 0;
                break;
            } else {
                Error++;
            }




            if (this.Hasu && this.HasV && this.Hasa && this.HasS && this.Hast){
                AllVal = Boolean.TRUE;
            }
            LoopError++;
        } while (LoopError != 3 && Error != 4 || AllVal);
    }
}
