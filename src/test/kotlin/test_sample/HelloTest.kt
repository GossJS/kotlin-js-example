package test_sample

import sample.loginForm
import sample.lineBreak

fun myApp() {
    QUnit.test("build a linebreak") { assert ->
        assert.ok(lineBreak().tagName == "BR", "Passed!")
    }

    QUnit.test("build a login form") { assert ->
        val form = loginForm();
        assert.ok(form.tagName == "FORM", "Passed!")
        assert.ok(form.getElementsByTagName("INPUT").length == 2, "Passed!")
        assert.ok(form.getElementsByTagName("BUTTON").length == 1, "Passed!")
    }

}