import "../styles/home.css";

function Home() {
    return (
        <main className="home">
            <div className="home-glow home-glow-1" />
            <div className="home-glow home-glow-2" />
            <div className="home-grid" />

            <div className="home-content">
                <span className="eyebrow">Gym Management</span>

                <h1 className="hero-title">
                    Run your gym with less effort,
                    <br />
                    more results
                </h1>

                <p className="hero-subtitle">
                    Keep track of members, payments, and routines all in one place,
                    so you can spend less time on paperwork and more time growing
                    your gym.
                </p>

                <button className="primary-btn hero-cta">Login</button>

                <p className="home-register">
                    Don't have an account?{" "}
                    <span className="register-link">Register now</span>
                </p>
            </div>
        </main>
    );
}

export default Home;