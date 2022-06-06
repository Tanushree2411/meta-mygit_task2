DESCRIPTION = "Simple hello application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/Tanushree2411/c-prog.git;protocol=https;branch=main"
SRCREV ="${AUTOREV}"

S = "${WORKDIR}/git"

do_compile() {
        ${CC} queue.c ${LDFLAGS} -o queue
}

do_install() {
        install -d ${D}${bindir}
        install -m 0755 queue ${D}${bindir}
}

