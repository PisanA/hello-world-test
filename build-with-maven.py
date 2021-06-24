
#!/usr/bin/env python3

import json
import os
import sys
from datetime import datetime
from contextlib import redirect_stderr, redirect_stdout
import subprocess

print("Running build-with-maven.py script")


def echoAndRun(cmd):
    print("===================")
    print(cmd)
    os.system(cmd)


echoAndRun("rm -rf hello-world-test")

echoAndRun("git clone --quiet https://github.com/PisanA/hello-world-test.git")

echoAndRun("rm -rf hello-world-test/target")
echoAndRun("ls -al")
echoAndRun("cd ..")
echoAndRun("ls -al")
echoAndRun("cp HelloWorld.java hello-world-test/src/main/java")
echoAndRun("ls -al")
echoAndRun("cd hello-world-test; mvn clean compile test --quiet --no-transfer-progress --batch-mode --fail-never")


