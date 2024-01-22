package org.hamma.customer;

import org.hamma.lib.CommonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("")
    public String viewHomePage(Model model) {
        String appName = CommonUtil.getAppName();

        model.addAttribute("appName", appName);

        return "index";
    }
}
