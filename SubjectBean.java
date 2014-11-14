/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package onlineexamintion;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kush Vatsa
 */
public class SubjectBean {

    private static int subId;
    private static Set<Integer> qSet=new HashSet<Integer>();
    public static int getSubId() {
        return subId;
    }

    public static void setSubId(int subId) {
        SubjectBean.subId = subId;
    }

    public static Set<Integer> getqSet() {
        return qSet;
    }

    public static void setqSet(Set<Integer> qSet) {
        SubjectBean.qSet = qSet;
    }

    
}
