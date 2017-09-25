package com.hjy.tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class DepartTag extends SimpleTagSupport  {
    public static final String[] STUDENT_SDEPT = {"计算机系", "信息系", "数学系"};
    
    private String sdept;

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        StringBuilder str = new StringBuilder();
        for (String s : STUDENT_SDEPT) {
            if (s.equals(sdept)) {
                str.append("<option value='").append(s).append("' selected>").append(s).append("</option>");
            } else {
                str.append("<option value='").append(s).append("'>").append(s).append("</option>");
            }
        }
        out.print(str.toString());
    }
}
