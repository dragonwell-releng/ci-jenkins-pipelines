targetConfigurations = [
        "x64Linux"    : [
                "ajdk"
        ],
        "x64Windows"  : [
                "ajdk"
        ],
        "aarch64Linux": [
                "ajdk"
        ],
        "riscv64Linux": [
                "ajdk"
        ]
]

// 18:05 Tue, Thur
triggerSchedule_nightly="TZ=UTC\n05 18 * * 2,4"
// 17:05 Sat
triggerSchedule_weekly="TZ=UTC\n05 17 * * 6"

// scmReferences to use for weekly release build
weekly_release_scmReferences=[
        "hotspot"        : "",
        "openj9"         : "",
        "corretto"       : "",
        "dragonwell"     : ""
]

return this
