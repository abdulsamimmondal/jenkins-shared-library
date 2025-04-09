def call() {
    stage('Checkout') {
        echo "Skipping checkout in non-SCM pipeline."
    }

    stage('Unit Tests') {
        echo "Running unit tests..."
        sh ' ./gradlew test'
    }

    stage('Deploy') {
        echo "Deploying app..."
    }
}
