/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.bintodec;
import java.util.regex.*;

/**
 *
 * @author PC
 */
public class BinToDec 
{

    public static void main(String[] args) throws Exception
    {
        final long MAX_INT = 2L * Integer.MAX_VALUE + 1L;
        var nDecNum = 0;
        var nBinPower = 1;
        var console = System.console();
        var nMaxBinaryLen = Math.ceil(Math.log(MAX_INT) / Math.log(2));
        var oRegExpr = Pattern.compile("^[0-1]+$");
        System.out.println("Input a binary number");
        var strLine = console.readLine();
        var nStrLen = strLine.length();
        var oMatcher = oRegExpr.matcher(strLine);
        var bIsMatch = oMatcher.matches();
        var bRightString = (nStrLen <= nMaxBinaryLen) && (bIsMatch);
        if(!bRightString)
        {
            System.out.println("Wrong binary number format!!!");
            System.exit(0);
        }
        for (int i = 0; i < nStrLen; i++)
        {
            int nBinDight = strLine.charAt(nStrLen - 1 - i) - '0';
            nDecNum += (nBinDight * nBinPower);
            nBinPower *= 2;
        }
        System.out.printf
        (
            "The decimal equivalent of the binary number %s is %d\r\n",
            strLine, nDecNum
        );
    }
}
