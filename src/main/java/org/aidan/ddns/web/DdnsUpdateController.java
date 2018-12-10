package org.aidan.ddns.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Aidan
 * @创建时间：2018/12/10 3:59 PM
 * @描述: DdnsUpdateController
 */
@RestController
@RequestMapping("/ddns")
public class DdnsUpdateController {

    @GetMapping("/update")
    public String updateDdns(HttpServletRequest request) {
        String remoteHost = request.getRemoteHost();
        return remoteHost;
    }
}
