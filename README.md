# 🔄 LeetCode → GitHub Auto Sync

This repository automatically syncs my accepted LeetCode solutions to GitHub using **GitHub Actions**.  
Whenever I solve a problem on LeetCode, it gets pushed here automatically.

---

## 🚀 Features
- Syncs all past accepted solutions
- Automatically syncs new submissions
- Runs every 6 hours
- No manual upload needed
- Organized problem folders

---

## ⚙️ How This Works

The automation uses:

- GitHub Actions workflow
- LeetCode session cookies
- leetcode-sync action

Workflow logs into LeetCode using cookies and fetches accepted submissions.

---

## 🛠 Setup Steps (How You Can Do This Too)

### 1️⃣ Create a GitHub Repository
Create an empty repository where solutions will be stored.

---

### 2️⃣ Get LeetCode Cookies
1. Log into LeetCode
2. Press **F12 → Application tab**
3. Go to:
Network → use filter(Fetch/XHR) → click graphql/ → cookies
4. Copy values of:
csrftoken
LEETCODE_SESSION

---

### 3️⃣ Add GitHub Secrets

Go to:
Repo → Settings → Secrets → Actions

Add:

| Name | Value |
|-----|------|
LEETCODE_CSRF_TOKEN | csrftoken value |
LEETCODE_SESSION | session value |

---

### 4️⃣ Enable Workflow Permissions

Settings → Actions → General

Enable: Read and write permissions in the workflow section

---

### 5️⃣ Create Workflow File

Create file: .github/workflows/leetcode-sync.yml


Paste:

```yaml
name: Sync LeetCode

on:
  workflow_dispatch:
  schedule:
    - cron: "0 */6 * * *"

jobs:
  sync:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout repository
        uses: actions/checkout@v4

      - name: Sync LeetCode submissions
        uses: joshcai/leetcode-sync@v1.5
        with:
          github-token: ${{ secrets.GITHUB_TOKEN }}
          leetcode-csrf-token: ${{ secrets.LEETCODE_CSRF_TOKEN }}
          leetcode-session: ${{ secrets.LEETCODE_SESSION }}
```
---

### 6️⃣ Create Workflow File

Go to: Repo → Actions → Sync LeetCode → Run workflow

---

### ❗ Troubleshooting
401 Error

Cookies expired → refresh cookies in GitHub Secrets.

---
### 🔒 Security Note

Never share your cookies. They provide account access.

---
### ⭐ Credits

GitHub Action used:

joshcai/leetcode-sync

---

### 👨‍💻 Author

Maintained by Aditya Rastogi

---

<div align="center">
  <p>
    <a href="#-leetcode--github-auto-sync">Back to top ↑</a>
  </p>
</div>



