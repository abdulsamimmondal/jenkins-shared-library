def call() {
    stage('Checkout') {
        echo "Skipping checkout in non-SCM pipeline."
    }

    stage('Unit Tests') {
        echo "Running unit tests..."
    }

    stage('Deploy') {
        echo "Deploying app..."
    }
}
