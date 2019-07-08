class SpaceAge {
    double seconds ;
    double secondsInEarth = 31557600;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds(double years) {
        return years*secondsInEarth;
    }

    double onEarth() {
        return  seconds/secondsInEarth;
    }

    double onMercury() {
        return seconds/getSeconds(0.2408467);
    }

    double onVenus() {
        return seconds/getSeconds(0.61519726);
    }

    double onMars() {
        return seconds/getSeconds(1.8808158);
    }

    double onJupiter() {
        return seconds/getSeconds(11.862615);
    }

    double onSaturn() {
        return seconds/getSeconds(29.447498);
    }

    double onUranus() {
        return seconds/getSeconds(84.016846);
    }

    double onNeptune() {
        return seconds/getSeconds(164.79132);
    }

}
