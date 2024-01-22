targetConfigurations = [
        'x64Linux'    : [
                'ajdk'
        ],
        'x64AlpineLinux' : [
                'ajdk'
        ],
        'x64Windows'  : [
                'ajdk'
        ],
        'aarch64Linux': [
                'ajdk'
        ],
        'riscv64Linux': [
                'ajdk'
        ]
]

// 23:30 Mon, Wed, Fri
//Uses releaseTrigger_21ea: triggerSchedule_nightly = 'TZ=UTC\n30 23 * * 1,3,5'
// 23:30 Sat
//Replaced by releaseTrigger_21ea: triggerSchedule_weekly = 'TZ=UTC\n30 23 * * 6'

// scmReferences to use for weekly release build
weekly_release_scmReferences = [
        'hotspot'        : '',
        'temurin'        : '',
        'openj9'         : '',
        'corretto'       : '',
        'dragonwell'     : ''
]

return this
