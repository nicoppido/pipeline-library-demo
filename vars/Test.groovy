
#!/usr/bin/env groovy

import net.test.test.TestUtils;

def call(context) {
    def test = new TestUtils();
    test.test(context);
}
