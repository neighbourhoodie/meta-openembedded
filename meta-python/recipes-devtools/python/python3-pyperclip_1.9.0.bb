DESCRIPTION = "A cross-platform clipboard module for Python. (only handles plain text for now)"
HOMEPAGE = "https://github.com/asweigart/pyperclip"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=d7dd4b0d1f7153322a546e89b5a0a632"

SRC_URI[sha256sum] = "b7de0142ddc81bfc5c7507eea19da920b92252b548b96186caf94a5e2527d310"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-ctypes \
"

BBCLASSEXTEND = "native nativesdk"
