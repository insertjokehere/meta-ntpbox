DESCRIPTION = "NTPBox display"
HOMEPAGE = ""
SECTION = "devel/python"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://licence.txt;md5=d32239bcb673463ab874e80d47fae504"

RDEPENDS_${PN} = "python python-imaging"
PR = "r0"

SRC_URI = "git://github.com/insertjokehere/ntpbox-display;protocol=git;rev=master"

S = "${WORKDIR}/git/"

inherit setuptools
