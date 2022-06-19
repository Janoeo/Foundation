filename=gradle.properties
ci_build_key="ci_build"
ci_build_value="true"
ci_build_number_key="ci_build_number"
ci_build_number_value=$1
org_gradle_daemon_key="org.gradle.daemon"
org_gradle_daemon_value="true"

sed -ir "s/^[#]*\s*${ci_build_key}=.*/$ci_build_key=$ci_build_value/" $filename
sed -ir "s/^[#]*\s*${ci_build_number_key}=.*/$ci_build_number_key=$ci_build_number_value/" $filename
sed -ir "s/^[#]*\s*${org_gradle_daemon_key}=.*/$org_gradle_daemon_key=$org_gradle_daemon_value/" $filename
