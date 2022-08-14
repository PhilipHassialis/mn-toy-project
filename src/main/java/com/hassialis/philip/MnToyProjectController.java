package com.hassialis.philip;

import io.micronaut.http.annotation.*;

@Controller("/mnToyProject")
public class MnToyProjectController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}