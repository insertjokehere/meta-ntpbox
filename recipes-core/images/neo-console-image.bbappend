DESCRIPTION = "NTPBox"
LICENSE = "MIT"

NTPBOX = " \
        pps-tools \
        ntp \
        htop \
        python3 \
        nano \
	ntpbox-display \
        gpsd \
"
 
IMAGE_INSTALL += " \
  ${NTPBOX} \
"

inherit extrausers
EXTRA_USERS_PARAMS = " \
    useradd -P ntpbox -G sudo ntpbox; \
"
