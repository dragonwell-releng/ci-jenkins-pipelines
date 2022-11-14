targetConfigurations = [
        "x64Linux"    : [
                "ajdk"
        ],
        "x64Windows"  : [
                "ajdk"
        ],
        "aarch64Linux": [
                "ajdk"
        ]
]


// 18:05 Mon, Wed, Fri
triggerSchedule_nightly="TZ=UTC\n05 18 * * 1,3,5"
// 12:05 Sat
triggerSchedule_weekly="TZ=UTC\n05 12 * * 6"

// scmReferences to use for weekly release build
weekly_release_scmReferences=[
        "hotspot"        : "",
        "openj9"         : "",
        "corretto"       : "",
        "dragonwell"     : ""
]

return this
