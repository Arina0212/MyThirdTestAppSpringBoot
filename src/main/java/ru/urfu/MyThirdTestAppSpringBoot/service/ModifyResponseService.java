package ru.urfu.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.urfu.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
